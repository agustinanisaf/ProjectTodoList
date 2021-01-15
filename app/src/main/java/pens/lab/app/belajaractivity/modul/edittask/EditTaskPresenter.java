package pens.lab.app.belajaractivity.modul.edittask;

import pens.lab.app.belajaractivity.data.model.Task;
import pens.lab.app.belajaractivity.data.source.local.TableHandler;

/**
 * Created by fahrul on 13/03/19.
 */

public class EditTaskPresenter implements EditTaskContract.Presenter{
    private final EditTaskContract.View view;
    private final TableHandler tableHandler;
    Task editedTask;
    Task deletedTask;
    Task sharedTask;

    public EditTaskPresenter(EditTaskContract.View view, TableHandler tableHandler) {
        this.view = view;
        this.tableHandler = tableHandler;
    }

    @Override
    public void start() {
    }

    @Override
    public void saveData(final String title, final String description){
        editedTask.setTitle(title);
        editedTask.setDescription(description);

        tableHandler.update(editedTask);

        view.redirectToTaskList();
    }

    @Override
    public void loadData(String id) {
        editedTask = (Task) tableHandler.readById(id);
        view.showData(editedTask);
    }

    @Override
    public void deleteData(String id) {
        deletedTask = (Task) tableHandler.readById(id);
        tableHandler.delete(deletedTask);

        view.redirectToTaskList();
    }

    @Override
    public void shareData(final String title, final String description) {
        sharedTask.setTitle(title);
        sharedTask.setDescription(description);
        
    }
}
