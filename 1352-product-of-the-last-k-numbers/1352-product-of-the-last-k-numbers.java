class ProductOfNumbers {
    ArrayList<Integer>ans ;

    public ProductOfNumbers() {
        ans = new ArrayList<>();
        
    }
    
    public void add(int num) {
        ans.add(num);
        
    }
    
    public int getProduct(int k) {
        int sum = 1;

        for(int i=ans.size()-1;i>=ans.size()-1-k+1;i--){
            sum *=ans.get(i);
        }

        return sum;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */