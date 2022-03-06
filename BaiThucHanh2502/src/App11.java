public class App11 {
    public static void main(String[] args) {
        int i,j,k;
            for(i = 0; i <= 4; i++)
                for(j = 0; j <= 10; j++)
                    for(k = 0; k <= 20; k++)
                        if((i * 50000 + j * 20000 + k * 10000) ==200000)
                            System.out.println(k+" to 10 000 + "+ j + " to 20 000 + " + i +" to 50 000");
    }
}