package pens.lab.app.belajaractivity.modul.sharetask;

import pens.lab.app.belajaractivity.data.model.Task;
import pens.lab.app.belajaractivity.data.source.local.TableHandler;

/**
 * Created by fahrul on 13/03/19.
 */

public class ShareTaskPresenter implements ShareTaskContract.Presenter{
    private final ShareTaskContract.View view;
    private final TableHandler tableHandler;
    Task editedTask;

    public ShareTaskPresenter(ShareTaskContract.View view, TableHandler tableHandler) {
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

}
