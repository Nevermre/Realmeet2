package br.com.sw2you.Realmeet;

import br.com.sw2you.Realmeet.api.facade.RoomsApi;
import br.com.sw2you.Realmeet.api.model.Room;
import java.util.concurrent.CompletableFuture;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Integer id) {
        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(new Room().id(1L).name("room 1")));
    }
}
