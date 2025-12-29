# P34 Exception - Gestione delle eccezioni
Le eccezioni sono errori che accadono durante l'esecuzione del programma in (runtime).

# Spigazione del try catch e finally
- try : contiene codice che potrebbe lanciare un'eccezione viene eseguito nel caso si accade al caso di quella specifica eccezione.
<br></br>
- catch: Gestisce un tipo specifico di eccezione eseguito solo se l'eccezzione matches combacia con la richiesta nel blocco del codice.
<br></br>
- finally: Sempre eseguito (chiusura delle risorse, clenup) viene eseguito sempre.

<h5> Nota: Dopo try il codiece normale continua solo se eccezione gestita o non avvenuto non viene eseguita se il programma va in crash.
</h5>

# Eccezioni gestite nel programma

- *'ArithmeticException'*: Divisione per zero.<br>

- *'InputMismatchException'*: Input non numerico con 'Scanner'.<br>

- *'Exception'*: Catch generale per errori imprevisti.

# Concetti chiave
- *'try'*: Blocco a rischio.<br>

- *'catch'*: Gestione specifica (piu specifica prima).<br>

- *'finally'*: Sempre eseguito (perfetto oer chiudere risorse come *'Scanner'*).<br>

- Il programma **continua** dopo l'errore grazie alla gestione.
