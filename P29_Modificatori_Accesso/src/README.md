# Classe Main (Modificatori Accesso)
Questo progetto dimostra i modificatori di accesso per incapsulamento/sicurezza: Controllano visibilità attributi/metodi.
<br><br>
**Pacchetti separati:** *pacchettoA* (**ClasseA/Main**), *pacchettoB* (**ClasseB/C**).

- **ClasseC estende ClasseA (eredità cross-package)**

## Attributi classe A
- **public**: Visibile ovunque (Main, B, C).
- **protected**: Visibile classe/pkg/subclass (Main, C). (B no).
- **default**: Package private (Main). (B,C no).
- ***private**: Solo ClasseA. getter public per accesso controllato. (Main, B, C no).

### Demo
=== TEST ACCESSO DA STESSO PACKAGE (Main in pacchettoA) === <br><br>
Da interno (ClasseA): <br><br>
  Public: Public: Visibile ovunque (world). <br><br>
  Protected: Protected: Visibile classe/pkg/subclass (altro pkg OK per subclass). <br><br>
  Default: Default: Solo classe/package (no subclass altro pkg).<br><br>
  Private: Private: Solo questa classe. <br><br>

=== TEST DA ALTRO PACKAGE VIA ISTANZA (ClasseB in pacchettoB) ===<br><br>
Da altro pkg (non subclass, istanza): <br><br>
  Public: Public: Visibile ovunque (world). <br><br>
  Private (via getter public): Private: Solo questa classe. <br><br>

=== TEST EREDITARIETÀ DA ALTRO PACKAGE (ClasseC extends ClasseA) === <br><br>
Da subclass (altro pkg): <br><br>
  Public: Public: Visibile ovunque (world). <br><br>
  Protected: Protected: Visibile classe/pkg/subclass (altro pkg OK per subclass). <br><br>
  Private (via getter public ereditato): Private: Solo questa classe. 