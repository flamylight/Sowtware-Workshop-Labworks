void main(){
    ArrayList<Train> trains = new ArrayList<>();

    while (true){
        IO.println("1. Add train\n" +
                "2. Have common seats\n" +
                "3. Find trains by route and time\n" +
                "0. Exit");

        IO.print("Your choice: ");
        var choice = IO.readln();

        switch (choice){
            case "1":
                var train = AddTrain();
                if (train != null){
                    trains.add(train);
                    IO.println("Successfully added!");
                }
                break;
            case "2":
                HaveCommonSeats(trains);
                break;
            case "3":
                FindTrainsByRouteAndTime(trains);
                break;
            case "0":
                return;
        }
    }
}

public Train AddTrain(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    IO.print("Destination: ");
    var destination = IO.readln();
    LocalDateTime departureTime = EnterDateTime(formatter, "Departure time (dd.MM.yyyy HH:mm)");

    var commonSeats = EnterPositiveInteger("Common seats");

    var coupeSeats = EnterPositiveInteger("Coupe seats");

    var reservedSeats = EnterPositiveInteger("reserved seats");

    var svSeats = EnterPositiveInteger("SV seats");

    return new Train(destination, departureTime, commonSeats, coupeSeats, reservedSeats, svSeats);
}

public void HaveCommonSeats(ArrayList<Train> trains){
    if (trains.isEmpty()){
        IO.println("No trains!");
        return;
    }

    ArrayList<Train> result = new ArrayList<>();

    for (Train train : trains){
        if (train.getCommonSeats() != 0){
            result.add(train);
            IO.println(train);
        }
    }

    if (result.isEmpty()){
        IO.println("Not found!");
    }
}

public void FindTrainsByRouteAndTime(ArrayList<Train> trains){
    if (trains.isEmpty()){
        IO.println("No trains!");
        return;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    ArrayList<Train> result = new ArrayList<>();

    IO.print("Destination: ");
    var destination = IO.readln();

    var date = EnterDateTime(formatter, "Departure time (dd.MM.yyyy HH:mm)");

    for (Train train : trains){
        if (destination.equalsIgnoreCase(train.getDestination()) &&
        date.isBefore(train.getDepartureTime())){
            result.add(train);
            IO.println(train);
        }
    }

    if (result.isEmpty()){
        IO.println("Not found!");
    }
}

public int EnterPositiveInteger(String parameter){
    while (true){
        IO.print(parameter + ": ");
        try{
            var number = Integer.parseInt(IO.readln());

            if (number < 0){
                IO.println(parameter + " cannot be less than 0!");
                continue;
            }

            return number;
        }
        catch (NumberFormatException ex){
            IO.println("Invalid input!");
        }
    }
}

public LocalDateTime EnterDateTime(DateTimeFormatter formatter, String messagePattern){
    while (true){
        IO.print(messagePattern + ": ");
        try{
            LocalDateTime date = LocalDateTime.parse(IO.readln(), formatter);
            return date;
        }
        catch (DateTimeParseException ex){
            IO.println("Incorrect date format!");
        }
    }
}