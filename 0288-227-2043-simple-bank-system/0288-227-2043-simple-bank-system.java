class Bank {
    HashMap<Integer, Long> map = null;
    public Bank(long[] balance){
       map = new HashMap<>();
       for(int i = 0; i < balance.length; i++){
        map.put(i + 1, balance[i]);
       }  
    }
    
    public boolean transfer(int account1, int account2, long money){
         if (map.containsKey(account1) && map.containsKey(account2) && map.get(account1) >= money) {
            map.put(account1, map.get(account1) - money);  // Deduct money from account1
            map.put(account2, map.get(account2) + money);  // Add money to account2
            return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money){
        if(map.containsKey(account)){
            map.put(account, map.get(account) + money);
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money){
        if(map.containsKey(account) && map.get(account) >= money){
            map.put(account, map.get(account) - money);
            return true; 
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */