public class Cat extends Animals {
    Cat(String name) {
        animal_type = "Кошка";
        animal_name = name;
        avg_run_distance = 200;
        max_run_distance = randomInt(avg_run_distance);
        avg_jump_height = 2;
        max_jump_height = randomFloat(avg_jump_height);
        can_swim = false;
        showMaxRun();
        showMaxJump();
        showMaxSwim();
        System.out.println();
    }
}
