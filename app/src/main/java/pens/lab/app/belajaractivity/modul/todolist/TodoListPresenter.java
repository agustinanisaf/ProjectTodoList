package pens.lab.app.belajaractivity.modul.todolist;

import java.util.ArrayList;

import pens.lab.app.belajaractivity.data.model.Task;
import pens.lab.app.belajaractivity.data.source.local.TableHandler;
import pens.lab.app.belajaractivity.data.source.session.SessionRepository;

/**
 * Created by fahrul on 13/03/19.
 */

public class TodoListPresenter implements TodoListContract.Presenter{
    private final TodoListContract.View view;
    private final SessionRepository sessionRepository;                                              //new
    private final TableHandler tableHandler;

    public TodoListPresenter(TodoListContract.View view, SessionRepository sessionRepository, TableHandler tableHandler) {           //add
        this.view = view;
        this.sessionRepository = sessionRepository;
        this.tableHandler = tableHandler;
    }

    @Override
    public void start() {}

    @Override
    public ArrayList<Task> getDataSet() {
        //get Data from DB
        ArrayList<Task> data = tableHandler.readAll();

        return data;
    }

}
