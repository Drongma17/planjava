package com.vanguard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class VanguardCode {

    PlanFormStoredProcedure planFormStoredProcedure = new PlanFormStoredProcedure();

    public List<PlanForm> planFormRetrievalMultiRequest(List<PlanFormInputEntity> prl) {
        List<Map<String, Object>> inputParameters = planFormStoredProcedure.planFormsInputParametersMulti(prl);
        List<PlanForm> planFormList = new ArrayList<>();

        try {
            // Create completable futures for parallel execution
            List<CompletableFuture<List<PlanForm>>> completableFutures = inputParameters.stream()
                    .map(input -> CompletableFuture.supplyAsync(() ->
                            (List<PlanForm>) planFormStoredProcedure.getPlanFormData(input)))
                    .collect(Collectors.toList());

            // Combine all futures
            CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                    completableFutures.toArray(new CompletableFuture[0]));

            // Process results when all complete
            CompletableFuture<List<PlanForm>> listCompletableFuture = allFutures.thenApply(v ->
                    completableFutures.stream()
                            .map(CompletableFuture::join)
                            .flatMap(List::stream)
                            .collect(Collectors.toList()));

            // Get the final result
            planFormList = listCompletableFuture.get();

        } catch (InterruptedException | ExecutionException e) {
            Thread.currentThread().interrupt();
            // Handle exception appropriately - log and/or throw custom exception
            throw new RuntimeException("Failed to retrieve plan forms", e);
        }

        return planFormList;
    }
}
