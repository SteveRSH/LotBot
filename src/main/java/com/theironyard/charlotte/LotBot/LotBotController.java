package com.theironyard.charlotte.LotBot;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
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
    List<Transaction> transactions = new ArrayList<>();

//*****************************The API*************************************************

    //Get a list of all lots in the system, including # of spots.  DONE
    @CrossOrigin
    @RequestMapping(path = "/lots", method = RequestMethod.GET)
    public List<Lot>getLots(){
        return lots;
}

    //Get a list of the status of all spots in the specified lot,
    // including the license plate # of anyone parked.              DONE
    @CrossOrigin
    @RequestMapping(path = "/lots/{id}", method = RequestMethod.GET)
//    @RequestBody
    public Lot getID(@PathVariable("id") int id) {
//        System.out.println(id); works in terminal
        return lots.get(id);
    }

    //Park a new car in the specified lot.    DONE
    // Must send the Car object in the request body.  DONE


    @CrossOrigin
    @RequestMapping(path = "/lots/{id}/{index}", method = RequestMethod.POST)
    public void addLot (@RequestBody Car cars, @PathVariable("index") int index, @PathVariable("id") int id)

    {

        Transaction transaction = new Transaction(cars, LocalDateTime.now());
        lots.get(id).getSpaces()[index] = new Space(transaction);
        transactions.add(transaction);


        System.out.println(transaction);


    }

    //Open up the specified spot and return the total owed.
    @CrossOrigin
    @RequestMapping(path = "/lots/{Id}/{index}", method = RequestMethod.PUT)
    public void setSpecifiedSpot() {

    }
    //Return a list of all transactions, DONE
    // along with the bill and license plate number of the charged vehicle.  DONE
    @CrossOrigin
    @RequestMapping(path = "/transactions", method = RequestMethod.GET)
    public List<Transaction> getTransaction(){
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

// find the lot based on the id
// get the array of space objects
// create a new transaction
// set the checkedIn variable for the transaction
// set the car variable for the transaction
// add that transaction to the array

// add the same transaction to the transactions List

//lots.get(id).getSpaces()[index] = new Space(transaction)
//lots.get(id).getSpaces()[index].setCar(car);
//getLots.add(Lot.createLot

//transaction.add(Transaction.createTransaction(cars,
//         LocalDateTime.now(), lots.get(id).getPrice()));