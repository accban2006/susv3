public class Reminder{
    

    public Reminder(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m:");
        this.m = scanner.nextInt();
        System.out.println("Enter n:");
        this.n = scanner.nextInt();
        scanner.close();
    }
    public void process() {
        for(int i = 0; i < n ; i++){
            if(i % 3 == 1 && i % 4 == 2 && i % 5 == 3 && i % 6 == 4){
                count ++;
            }
        }
    }
    public static void main(String[] args) {
        Reminder reminder = new Reminder(0, 0);
        reminder.input();
        reminder.process();
        
        System.out.printf("So gia tri la: %s\n", count);
        scanner.close();
    
    }
}
    
