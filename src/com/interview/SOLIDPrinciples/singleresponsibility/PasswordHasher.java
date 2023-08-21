package com.interview.SOLIDPrinciples.singleresponsibility;

public class PasswordHasher
{
    public void hashAndSavePassword(String password)
    {
        hashPassword();
        savePassword();
    }

    public void hashPassword()
    {
        //hashing implementation
    }
    public void savePassword()
    {
        //save to the db
    }
}