package com.selfPro.JournalApp.Controller;
import java.util.*;
import com.selfPro.JournalApp.entity.JournalEntry;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long,JournalEntry> m = new HashMap<>();


    @GetMapping("/getAll")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(m.values());
    }

    @PostMapping("/post")
    public boolean postData(@Valid @RequestBody JournalEntry myEntry){
        m.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("getId/{myId}")
    public JournalEntry getById(@PathVariable Long myId){
        return m.get(myId);
    }

    @DeleteMapping("del/{myId}")
    public boolean delById(@PathVariable Long myId){
        m.remove(myId);
        return true;

    }
    @PutMapping("update/{myID}")
    public boolean changeById(@PathVariable Long myID,@RequestBody JournalEntry changeEntry){
        m.put(myID, changeEntry);
        return true;

    }

}
