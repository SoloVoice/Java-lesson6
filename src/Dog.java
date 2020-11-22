public class Dog extends Animals {
    Dog(String name) {
        animal_type = "Собака";
        animal_name = name;
        avg_run_distance = 500;
        max_run_distance = randomInt(avg_run_distance);
        avg_jump_height = 0.5f;
        max_jump_height = randomFloat(avg_jump_height);
        can_swim = true;
        avg_swim_distance = 10;
        max_swim_distance = randomInt(avg_swim_distance);
        showMaxRun();
        showMaxJump();
        showMaxSwim();
        System.out.println();
    }
}
