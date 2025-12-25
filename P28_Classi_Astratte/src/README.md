# Classe Main (Classi Astratte)
Questa classe introduce classi astratte (*abstract class*): Template non instanziabili, per definire struttura comune.
**Metodi astratti** (*abstract void metodo();*): Senza corpo; sottoclassi devono implementarli (*@Override*).

### Ereditarietà
Sottoclassi ereditano concreti; poliformismo: Reference superclasse chiama override.

### Struttura
- **Astratta:** Veicolo (modello; astratti: azioni1-4; concreto: infoVeicolo).
<br><br>

- **Concreta**: Automobile (extends; implementa azioni; es.DeLorean).
<br><br>

- **Demo**: Crea Automobile; chiama azioni (implementate); assegna a Veicolo (poliformismo).


### Output
=== CLASSE ASTRATTA E METODI DELLA CLASSE VEICOLO === <br><br>
Azione1: L'automobile viene accesa! <br><br>
Azione2: L'automobile viene messa in movimento! <br><br>
Azione3: L'automobile viene fermata a causa di un ostacolo! <br><br>
Azione4: L'automobile viene spenta per fine del test! <br><br>
Info veicolo: DeLorean DMC-12 (classe astratta da Veicolo). <br><br>