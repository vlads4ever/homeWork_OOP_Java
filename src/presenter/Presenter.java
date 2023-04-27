package presenter;

import model.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void getTreeInfo() {
        view.print(service.getTreeInfo());
    }

    public void addPerson(String firstName, String lastName, int age, String gender) {
        service.addPerson(firstName, lastName, age, gender);
    }

    public void addPersonAs(String firstName, String lastName, int age, String gender,
                            String targetFirstName, String targetLastName, String relation) {
        service.addPersonAs(firstName, lastName, age, gender, targetFirstName, targetLastName, relation);
    }

    public void getInfo(String firstName, String lastName, String relation) {
        view.print(service.getInfo(firstName, lastName, relation));
    }

    public void getInfo(String firstName, String lastName) {
        view.print(service.getInfo(firstName, lastName));
    }

    public void printSortByAge() {
        service.printSortByAge();
    }

    public void printSortByFirstName() {
        service.printSortByFirstName();
    }

    public void printSortByLastName() {
        service.printSortByLastName();
    }
}