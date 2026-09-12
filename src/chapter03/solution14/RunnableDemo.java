package chapter03.solution14;

public class RunnableDemo {
    public static Runnable runTasks(Runnable[] tasks) {
        return () -> {
            for (Runnable task : tasks) {
                task.run();
            }
        };
    }

    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("111");
        Runnable task2 = () -> System.out.println("222");
        Runnable task3 = () -> System.out.println("333");

        Runnable[] tasks = { task1, task2, task3 };

        runTasks(tasks).run();
    }
}
