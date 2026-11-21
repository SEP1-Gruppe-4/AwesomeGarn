package awesomegarn.persistence;

import awesomegarn.domain.Yarn;

import java.io.*;
import java.util.List;

public class FileDataManager implements DataManager {
    private final String filePath = ""; // TODO - update file location (fx "data/yarn.bin")

    public FileDataManager() {
        // TODO
    }

    // TODO: CRUD-metoderne nedenfor: hent/ændr beholdningen, og kald saveData(...) bagefter (loadData() ved opstart)
    @Override
    public List<Yarn> getAllYarns() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void addYarn(Yarn yarn) {
        // TODO
    }

    @Override
    public void updateYarn(Yarn original, Yarn updated) {
        // TODO
    }

    @Override
    public void deleteYarn(Yarn yarn) {
        // TODO
    }

    private void saveData(DataContainer data) {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(filePath)
                     )
        ) {
            outputStream.writeObject(data);
        }
        catch (IOException e) {
            // TODO - Fejlbesked til brugeren: kast DataStorageException
        }
    }

    private DataContainer loadData() {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(filePath))
        ) {
            return (DataContainer) inputStream.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            // TODO - Fejlbesked til brugeren: kast DataStorageException
            // TODO - findes filen ikke endnu (første start): returner en tom DataContainer i stedet
            throw new UnsupportedOperationException("TODO");
        }
    }
}
