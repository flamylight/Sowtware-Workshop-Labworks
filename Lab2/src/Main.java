
void main(){
    Random rand = new Random();

    int randomNumber = rand.nextInt(10000, 100000);

    IO.println("Random number: " + randomNumber);

    String randomNumberStr = Integer.toString(randomNumber);

    char[] splitNumbers = randomNumberStr.toCharArray();

    for (int i = 0; i < splitNumbers.length; i++){
        int numberInt = splitNumbers[i] - '0';

        if (numberInt % 2 == 0){
            splitNumbers[i] = (char)((numberInt / 2) + '0');
        }
    }

    char temp = splitNumbers[0];
    splitNumbers[0] = splitNumbers[1];
    splitNumbers[1] = temp;

    String joinedString = new String(splitNumbers);

    int result = Integer.parseInt(joinedString);

    IO.println("Result: " + result);
}
