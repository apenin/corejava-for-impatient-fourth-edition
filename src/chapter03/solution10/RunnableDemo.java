package chapter03.solution10;

public class RunnableDemo {
    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("111");
        Runnable task2 = () -> System.out.println("222");
        Runnable task3 = () -> System.out.println("333");
        Runnable[] tasks1 = { task1, task2, task3 };

        Runnable task4 = () -> System.out.println("444");
        Runnable task5 = () -> System.out.println("555");
        Runnable task6 = () -> System.out.println("666");
        Runnable[] tasks2 = { task4, task5, task6 };

        runTogether(tasks1);
        runInOrder(tasks2);
    }
}
