public class Runner {
    public static void main(String[] args) {

        Stack nums = new Stack();
        System.out.println(nums.isEmpty());
        nums.push(15);
        nums.push(10);
        System.out.println(nums.size());
        nums.push(5);
        nums.push(0);
        nums.push(5);
        System.out.println(nums.size());
        System.out.print(nums.pop());
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        nums.show();

    }
}
