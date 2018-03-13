package exam;

class Test9 {
    public static void main(String args[]) {
        Test9 t= new Test9();
        System.out.println(t.xyz(6));    
    }
    public int xyz(int num) {
        if(num == 1) return 1;
        else return(xyz(num-1)* num);
    }
}