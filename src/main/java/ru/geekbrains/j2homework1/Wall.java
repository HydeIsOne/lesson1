package ru.geekbrains.j2homework1;


    public class Wall extends Barrier {

        private int height;

        public Wall(String name, int height) {
            super(name);

            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        @Override
        protected boolean moving(Moves Moves) {
            System.out.println(super.getName() + " height: " + this.height);

            Moves.jump();

            if (getHeight() <= Moves.getJumpHeight()) {
                System.out.println("Перепрыгнул");

                return true;
            } else {
                System.out.println("Не перепрыгнул");

                return false;
            }
        }
    }

