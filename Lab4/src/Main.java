void main(){
    while (true){

        IO.println("1. Task\n" +
                "0. Exit");

        IO.print("Choice: ");
        var choice = IO.readln();

        switch (choice){
            case "1":
                IO.print("Input file: ");
                var inputFileConsole = IO.readln();

                IO.print("Output file: ");
                var outputFileConsole = IO.readln();

                File inputFile = new File(inputFileConsole);
                File outputFile = new File(outputFileConsole);

                try {
                    Scanner reader = new Scanner(inputFile);
                    PrintWriter writer = new PrintWriter(outputFile);

                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();

                        Pattern pattern = Pattern.compile("\\w{3,}");
                        Matcher matcher = pattern.matcher(line);

                        StringBuilder sb = new StringBuilder();
                        int lastEnd = 0;

                        while (matcher.find()) {
                            sb.append(line, lastEnd, matcher.start());

                            sb.append(matcher.group().toUpperCase());

                            lastEnd = matcher.end();
                        }
                        sb.append(line.substring(lastEnd));

                        writer.println(sb);
                    }

                    reader.close();
                    writer.close();

                    System.out.println("Done! Everything is written in " + outputFile);

                } catch (FileNotFoundException e) {
                    System.out.println("File not found! Check the names.");
                }
                break;

            case "0":
                return;
        }

    }
}