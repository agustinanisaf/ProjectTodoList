package pens.lab.app.belajaractivity.modul.newtask;

import pens.lab.app.belajaractivity.data.model.Task;
import pens.lab.app.belajaractivity.data.source.local.TableHandler;
import pens.lab.app.belajaractivity.data.source.session.SessionRepository;

/**
 * Created by fahrul on 13/03/19.
 */

public class NewTaskPresenter implements NewTaskContract.Presenter{
    private final NewTaskContract.View view;
    private final SessionRepository sessionRepository;                                              //new
    private final TableHandler tableHandler;

    public NewTaskPresenter(NewTaskContract.View view, SessionRepository sessionRepository, TableHandler tableHandler) {           //add
        this.view = view;
        this.sessionRepository = sessionRepository;
        this.tableHandler = tableHandler;
    }
    @Override
    public void start() {}

    @Override
    public void saveData(final String title, final String description){
        Task newTask = new Task(title, description);
        //save new task
        tableHandler.create(newTask);

        //then go back to task list
        view.redirectToTaskList();
    }

}
