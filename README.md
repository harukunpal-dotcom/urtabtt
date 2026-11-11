# urtabtt — お化け屋敷MOD

Minecraft 26.3 / Fabric / Java 25 向けのお化け屋敷追加MODです。

## v1.0 の開発目標

- 探索中に自然生成されるお化け屋敷
- 専用アイテム「お化け屋敷の招待状」で任意の場所に出現させるお化け屋敷
- 屋敷内などに出現し、プレイヤーを追いかける幽霊モンスター

詳しい仕様と実装順序は [docs/HAUNTED_HOUSE_MOD_PLAN.md](docs/HAUNTED_HOUSE_MOD_PLAN.md) を参照してください。

## 開発環境

- Minecraft: 26.3
- Mod loader: Fabric
- Java: 25
- ローカルのテンプレートで確認した Fabric Loom: 1.19.4
- ローカルの Gradle Wrapper: 9.8.2

## ビルド

プロジェクト一式を取得した後、プロジェクトのルートで実行します。

```bash
./gradlew build
```

生成物は `build/libs/` に出力されます。Minecraft の `mods` フォルダーには通常のMOD JARを入れてください（`-sources.jar` は入れません）。

## 現在の状態

GitHub上では初期の README と初期化クラスに加えて、お化け屋敷MODの仕様書を追加しました。
ただし、現在のGitHubリポジトリにはビルド設定・Gradle Wrapper・Fabricメタデータなどのプロジェクト一式が揃っていません。
そのため、GitHub上のコードはまだビルド可能な完成状態ではなく、幽霊や屋敷のゲーム内実装もこれからです。

まず、ローカルでビルド成功した Minecraft 26.3 Fabric テンプレート一式をリポジトリに揃え、その後に小さな単位で機能を実装します。
