package com.theironyard.charlotte.LotBot;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController //for APIs
public class LotBotController {

    // Here we're storing a list of lots.
    // does a list make sense here? It may,
    // but it's also possible another data
    // structure will make your life easier.
    // think critically about your choices
    List<Lot> lots = new ArrayList<>();
    @CrossOrigin
    @RequestMapping(path = "/lots", method = RequestMethod.GET)
    public List<Lot>getLots(){
        return lots;
}
    @CrossOrigin
    @RequestMapping(path = "/lots/{id}", method = RequestMethod.GET)
//    @RequestBody
    public void getID(@PathVariable("id") int id) {
        lots.get(id);
    }

    @CrossOrigin
    @RequestMapping(path = "/lots/{id}", method = RequestMethod.POST)
    public void addLot (@RequestBody Car cars, @PathVariable("id") int id) {


//    setID(@PathVariable("id") int id) {
//        lots.set(id).getSpaces();
    }
    @CrossOrigin
    @RequestMapping(path = "/lots/{Id}/{spot}", method = RequestMethod.PUT)
    public void setSpecifiedSpot() {

    }

    List<Transaction> transactions = new ArrayList<>();
    @CrossOrigin
    @RequestMapping(path = "/transactions", method = RequestMethod.GET)
    public List<Transaction>getTransaction(){
        return transactions;
    }

//}



    /**
     * The @PostConstruct method will cause whichever
     * method it's annotating to run after the controller
     * is created by Spring.
     *
     * In this case, let's use it to give a value to
     * our list of "lots"
     */
    @PostConstruct
    public void postConstruct() {
        // we have to create lots of lots here
        // if you want fewer lots than 20
        // that's okay too
        for (int i = 0;i < 20;i++) {
            lots.add(Lot.createLot());
        }
    }
}







// @RequestMapping(path = /lots/<id>/<spot>, method = RequestMethod.PUT)

//}

// @RequestMapping(path = "/transactions", method = RequestMethod.GET)

//}

