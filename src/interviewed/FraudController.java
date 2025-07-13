package interviewed;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//
//@RestController
//@RequestMapping("/api/fraud")
//public class FraudController {
//
//    private static final Map<String, Double> thresholds = new ConcurrentHashMap<>();
//
//    static {
//        thresholds.put("US", 10000.0);
//        thresholds.put("IN", 5000.0);
//        thresholds.put("UK", 8000.0);
//    }
//
//    @PostMapping("/detect")
//    public Flux<String> detectFraud(@RequestBody Flux<Transaction> transactions) {
//        return transactions
//                .delayElements(Duration.ofMillis(50)) // simulate processing time
//                .publishOn(Schedulers.parallel())     // multi-threaded processing
//                .map(txn -> {
//                    double limit = thresholds.getOrDefault(txn.getCountry(), 5000.0);
//                    if (txn.getAmount() > limit) {
//                        return "🚨 FRAUD: " + txn.getId() + " > $" + txn.getAmount();
//                    } else {
//                        return "✅ Safe: " + txn.getId();
//                    }
//                });
//    }
//}