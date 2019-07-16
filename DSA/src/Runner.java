public class Runner {
    public static void main(String[] args) {

        DStack nums = new DStack();
//        System.out.println(nums.isEmpty());
        nums.push(15);
        nums.push(10);
//        System.out.println(nums.size());
        nums.push(5);
        nums.push(0);
        nums.push(5);
        nums.show();
        System.out.println();
//        System.out.println(nums.size());

        nums.pop();
        nums.pop();
        System.out.println();
        nums.show();
        nums.pop();
        nums.pop();
        System.out.println();
        nums.show();
    }
}
