public class TryFinallyTest {
    public static void main(String[] args) {
        //finallyWithTrow();

        //finallyWithReturn();

        //finallyWithJVMKill();

        //finallyWithRuntimeHalt();

        finallyDontProcessAllAftertryCatch();

        System.out.println(finallyReturn());
    }

    static void finallyWithTrow() {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }

    static void finallyWithReturn() {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }

    static void finallyWithJVMKill() {
        try {
            System.exit(42); // или Runtime.getRuntime().exit(42); < синоним
        } finally {
            System.err.println("finally");
        }
    }

    static void finallyWithRuntimeHalt() {
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }

    static void finallyDontProcessAllAftertryCatch() {
        try {
            System.err.println("try");
            if (true) {
                throw new RuntimeException();
            }
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }

    static int finallyReturn() {
        try {
            if(false)throw new RuntimeException();
            return 0;                               //в любом случае метод вернет значение из finally
        } finally {
            return 1;
        }

    }

    static int tryInTry(){
        try {
            throw new Exception();
        }catch (Exception e){

        } finally {
            try {
                if(true)throw new Exception();
            }catch (Exception e){

            } finally {
                return 1;
            }


            //return 2; error
        }
    }
}
