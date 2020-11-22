public class Animals {
    String animal_type;
    String animal_name;
    float avg_run_distance;
    int max_run_distance;
    float avg_jump_height;
    float max_jump_height;
    boolean can_swim;
    float avg_swim_distance;
    int max_swim_distance;

    void showMaxRun() {
        System.out.println(this.animal_type + " " + this.animal_name + " может пробежать " + this.max_run_distance + " метров.");
    }

    void showMaxJump() {
        System.out.print(this.animal_type + " " + this.animal_name + " прыгает максимум на ");
        System.out.printf("%.2f", this.max_jump_height);
        System.out.print(" метров\n");
    }

    void showMaxSwim() {
        if (can_swim) {
            System.out.println(this.animal_type + " " + this.animal_name + " может проплыть " + this.max_swim_distance + " метров.");
        } else {
            System.out.println(this.animal_type + " " + this.animal_name + " плавать не умеет.");
        }
    }

    void run(int distance) {
        this.max_run_distance -= distance;
        if (this.max_run_distance > 0) {
            System.out.println(this.animal_type + " " + this.animal_name + " пробежала " + distance + " метров.");
            System.out.println(this.animal_type + " " + this.animal_name + " может пробежать еще " + this.max_run_distance + " метров.\n");
        } else {
            System.out.println("На такую дистанцию " + this.animal_type + " " + animal_name + " пробежать уже может.\n");
        }
    }

    void jump(float height) {
        this.max_jump_height -= height;
        if (this.max_jump_height > 0) {
            System.out.println(this.animal_type + " " + this.animal_name + " прыгнула " + height + " метров.");
            System.out.print(this.animal_type + " " + this.animal_name + " может прыгнуть еще ");
            System.out.printf("%.2f", this.max_jump_height);
            System.out.print(" метров.\n\n");
        } else {
            System.out.println("На такую высоту " + this.animal_type + " " + animal_name + " прыгнуть не может.\n");
        }
    }

    void swim(int distance) {
        this.max_swim_distance -= distance;
        if (this.max_swim_distance > 0) {
            System.out.println(this.animal_type + " " + this.animal_name + " проплыла " + distance + " метров.");
            System.out.println(this.animal_type + " " + this.animal_name + " может проплыть еще " + this.max_swim_distance + " метров.\n");
        } else {
            System.out.println("Такую дистанцию " + this.animal_type + " " + animal_name + " проплыть не может.\n");
        }
    }

    int randomInt(float base_num) {
        float x = (float) (Math.random() / 4);
        int positive_or_negative = (int) (Math.random() * 2);
        if (positive_or_negative == 0) {
            return (int) (base_num * (1 - x));
        }
        return (int) (base_num * (1 + x));
    }

    float randomFloat(float base_num) {
        float x = (float) (Math.random() / 4);
        int positive_or_negative = (int) (Math.random() * 2);
        if (positive_or_negative == 0) {
            return (base_num * (1 - x));
        }
        return (base_num * (1 + x));
    }

}
