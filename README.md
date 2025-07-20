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
