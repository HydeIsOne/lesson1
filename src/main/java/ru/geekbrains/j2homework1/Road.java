package ru.geekbrains.j2homework1;


public class Road extends Barrier {
        private int length;

        public Road(String name, int length) {
            super(name);

            this.length = length;
        }

        public int getLength() {
            return length;
        }

        @Override
        protected boolean moving(Moves moves) {
            System.out.println(super.getName() + " length: " + this.length);

            moves.run();

            if (getLength() <= moves.getRunDistance()) {
                System.out.println("Пробежал");

                return true;
            } else {
                System.out.println("Не пробежал");

                return false;
            }
        }
    }

