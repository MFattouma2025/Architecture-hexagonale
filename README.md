# 📘 Règles de codage Java – Conventions & Bonnes pratiques

Ce document sert de **rappel rapide** des bonnes pratiques Java en matière de style, nommage, structure et qualité de code. Il est adapté aux projets professionnels, personnels ou collaboratifs.

---

## 📐 Structure des classes

- 📌 Une seule classe publique par fichier `.java`
- 📚 Ordre recommandé dans une classe :
  1. Constantes (`static final`)
  2. Attributs (souvent `private`)
  3. Constructeurs
  4. Méthodes publiques
  5. Méthodes protégées
  6. Méthodes privées
  7. Classes internes (si nécessaire)

---

## 📏 Longueur des classes et des méthodes

### ✅ Recommandations générales :

| Élément     | Limite recommandée               |
|-------------|----------------------------------|
| ✅ Classe    | ≤ 200–300 lignes                 |
| ✅ Méthode   | ≤ 20–30 lignes (idéalement ≤ 15) |
| ✅ Niveaux imbriqués | ≤ 3 blocs (`if`, `for`, etc.) |
| ✅ Fichier `.java` | ≤ 1 000 lignes              |

➡️ Si une classe ou une méthode devient trop longue :
- Penser à **extraire des sous-classes** ou **des méthodes privées**
- Vérifier le respect du **SRP** et de la **cohésion**

---

## 🔤 Conventions de nommage

| Élément       | Convention       | Exemple                         |
|---------------|------------------|----------------------------------|
| Classe        | PascalCase       | `ClientService`, `RapportPdf`   |
| Interface     | PascalCase       | `Runnable`, `DataProcessor`     |
| Méthode       | camelCase        | `calculerSalaire()`, `envoyerEmail()` |
| Variable      | camelCase        | `total`, `nombreClients`        |
| Constante     | MAJUSCULE_SNAKE  | `MAX_RETRIES`, `DEFAULT_PORT`   |
| Package       | tout en minuscules avec des points | `com.expertjava.utils` |

---

## ✍️ Style et formatage

- ✅ Indentation : **4 espaces** (pas de tabulations)
- ✅ Une instruction par ligne
- ✅ Une ligne vide entre deux méthodes
- ✅ Accolades **sur la même ligne** que `if`, `for`, `while`, `class`, etc.

```java
public class ClientService {

    public void enregistrerClient() {
        if (client != null) {
            // Traitement
        }
    }
}
```
# 📘 Concepts et Principes clés en développement logiciel

Ce document présente un résumé clair et synthétique des concepts **DDD, TDD, BDD** et des principes **GRASP, KISS, DRY, YAGNI**.  
Il est destiné à servir de rappel rapide pour écrire du code propre, maintenable et aligné avec les bonnes pratiques.

---

## 1. Comparaison : DDD, TDD, BDD

| Méthode / Approche | Définition                                                                 | Objectif principal                                       | Avantages clés                                                                 |
|---------------------|----------------------------------------------------------------------------|-----------------------------------------------------------|----------------------------------------------------------------------------------|
| **DDD**<br>(Domain-Driven Design) | Conception logicielle centrée sur le **métier** : le code reflète fidèlement la logique métier, en collaboration avec les experts fonctionnels. | Créer un **modèle métier riche, cohérent et évolutif**.  | ✔ Meilleure compréhension métier<br>✔ Code aligné avec le langage fonctionnel<br>✔ Favorise la modularité (Bounded Contexts)<br>✔ Facilite la maintenabilité |
| **TDD**<br>(Test-Driven Development) | Développement guidé par les **tests unitaires** : écrire les tests **avant** le code. | Améliorer la **qualité du code** et la **robustesse**.    | ✔ Code testé dès le départ<br>✔ Moins de bugs<br>✔ Meilleure conception (découpage logique)<br>✔ Refactorisation plus sûre |
| **BDD**<br>(Behavior-Driven Development) | Extension de TDD orientée sur le **comportement attendu**, exprimé en langage naturel (Gherkin : Given / When / Then). | Définir et tester les **comportements fonctionnels** attendus avec des scénarios clairs. | ✔ Collaboration entre métier, QA et dev<br>✔ Spécifications vivantes<br>✔ Documentation automatique<br>✔ Tests compréhensibles par tous |

---

## 2. Principes clés : GRASP, KISS, DRY, YAGNI

| Principe         | Définition                                                                                                                                                 | Avantages clés                                                      |
|------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------|
| **GRASP**<br>(General Responsibility Assignment Software Patterns) | Ensemble de **patterns d’attribution des responsabilités** en POO. Il guide comment assigner les responsabilités aux classes et objets (ex: Expert, Creator, Controller). | ✔ Meilleure organisation du code<br>✔ Répartition claire des responsabilités<br>✔ Facilite la maintenabilité et l’évolution |
| **KISS**<br>(Keep It Simple, Stupid)          | Principe qui encourage à **garder le code simple** et éviter la complexité inutile.                                                                                 | ✔ Code plus lisible<br>✔ Facile à comprendre et maintenir<br>✔ Moins d’erreurs |
| **DRY**<br>(Don’t Repeat Yourself)             | Éviter la **duplication de code ou logique** en favorisant la réutilisation et l’abstraction.                                                                        | ✔ Réduction des erreurs<br>✔ Code plus court et clair<br>✔ Facilité de modification (une seule source de vérité) |
| **YAGNI**<br>(You Ain’t Gonna Need It)         | Ne pas ajouter de fonctionnalités ou code avant qu’ils ne soient réellement nécessaires.                                                                             | ✔ Gain de temps<br>✔ Code plus simple<br>✔ Moins de maintenance inutile |

---

## 3. Exemples rapides

### DRY violé

```java
public void calculerSalaireEmploye() {
    double salaire = heures * tauxHoraire;
    System.out.println("Salaire: " + salaire);
}
public void calculerSalaireManager() {
    double salaire = heures * tauxHoraire * 1.5;
    System.out.println("Salaire: " + salaire);
}
