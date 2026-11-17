# Changelog

## 0.12.3

_2026-11-17_

- **Update sbt-scalafix to 0.14.10 (#170)**  
  sbt-scalafix 0.14.9 doesn't support sbt 2.1: in sbt 2.1.x builds,
  `scalafix` and `scalafixCheckAll` report `SemanticDB not found` for every
  file. 0.14.10 adds sbt 2.1 support. Builds on sbt 2.0.x keep working.

## 0.12.2

_2026-10-29_

- **Compile with the Scala version of sbt 2.0.x**  
  0.12.1 was compiled with Scala 3.9.0, which put scala3-library 3.9.0 on
  the meta-build classpath of consumers. sbt 2.0.x compiles with 3.8.4 and
  cannot read its TASTy, so builds using 0.12.1 failed to load. Use 0.12.2
  instead of 0.12.1.

## 0.12.1

_2026-10-29_

- Update scala3-library to 3.9.0 (#163)
- Update sbt-scalafix to 0.14.9 (#165)
- Update sbt-scalafix to 0.14.8 (#164)
- Update sbt-ci-release to 1.12.1 (#160)
- Update sbt to 2.0.12 (#169)
- Update sbt to 2.0.11 (#168)
- Update sbt to 2.0.10 (#167)
- Update sbt to 2.0.9 (#166)
- Update sbt to 2.0.8 (#162)
- Update sbt to 2.0.7 (#161)

## 0.12.0

_2026-08-11_

- Upgrade to sbt 2.0.6 (requires sbt 2, no longer compatible with sbt 1)
- Upgrade to scala 3.8.4
- Upgrade to scalafmt 3.11.5
- Upgrade to sbt-scalafmt 2.6.2
- Upgrade to sbt-scalafix 0.14.7
- Replace deprecated `url(...)` with `uri(...)`
- Remove sbt-blowout-yaml in favor of hand-maintained GitHub Actions workflows
- Update sbt, scripted-plugin to 1.12.15 (#158)
- Update sbt, scripted-plugin to 1.12.14 (#153)
- Update sbt-ci-release to 1.12.0 (#151)
- Update sbt-tpolecat to 0.5.7 (#149)
- Update sbt, scripted-plugin to 1.12.13 (#148)
- Update sbt-tpolecat to 0.5.6 (#145)
- Update sbt, scripted-plugin to 1.12.12 (#144)
- Update sbt-tpolecat to 0.5.5 (#142)
- Update sbt-tpolecat to 0.5.4 (#140)
- Update sbt, scripted-plugin to 1.12.11 (#139)
- Update sbt, scripted-plugin to 1.12.10 (#138)
- Update sbt, scripted-plugin to 1.12.9 (#136)
- Update sbt, scripted-plugin to 1.12.8 (#135)
- Update sbt, scripted-plugin to 1.12.6 (#134)
- Update sbt, scripted-plugin to 1.12.5 (#133)
- Update sbt-scalafix to 0.14.6 (#132)
- Update sbt, scripted-plugin to 1.12.4 (#131)
- Update sbt, scripted-plugin to 1.12.3 (#130)

## 0.11.10

_2026-02-07_

- Disable RemoveUnused.imports to avoid conflicts with OrganizeImports.removeUnused
- Upgrade to sbt-tpolecat 0.5.3

## 0.11.9

_2026-02-04_

- Upgrade to scalafmt 3.10.6
- Upgrade to sbt-scalafix 0.14.5
- Upgrade to sbt 1.12.2
- Update sbt, scripted-plugin to 1.12.1 (#126)
- Update sbt-scoverage to 2.4.4 (#125)
- Update sbt, scripted-plugin to 1.12.0 (#124)
- Update scala-library to 2.12.21 (#121)

## 0.11.8

_2025-12-06_

- Upgrade to sbt-scoverage 2.4.2
- Upgrade to scalafmt 3.10.2
- Upgrade to sbt-scalafmt 2.5.6

## 0.11.7

_2025-10-15_

- Upgrade to scalafmt 3.10.0
- Upgrade to scalafix 0.14.4
- Update sbt, scripted-plugin to 1.11.7 (#110)
- Update sbt, scripted-plugin to 1.11.6 (#108)
- Update sbt, scripted-plugin to 1.11.5 (#107)
- Update sbt-ci-release to 1.11.2 (#106)

## 0.11.6

_2025-08-14_

- Upgrade to sbt-ci-release 1.11.1
- Upgrade to scalafmt 3.9.9
- Upgrade to sbt-scalafmt 2.5.5
- Update sbt, scripted-plugin to 1.11.4 (#105)
- Update sbt, scripted-plugin to 1.11.3 (#103)
- Update sbt, scripted-plugin to 1.11.0 (#96)
- Update sbt-ci-release to 1.11.0 (#95)

## 0.11.5

_2025-05-10_

- Upgrade to scalafmt 3.9.6
- Update sbt-scalafix to 0.14.3 (#94)
- Update sbt, scripted-plugin to 1.10.11 (#91)
- Update sbt-ci-release to 1.9.3 (#89)
- Update sbt, scripted-plugin to 1.10.10 (#87)
- Update sbt, scripted-plugin to 1.10.9 (#86)
- Update scalafmt-core to 3.9.2 (#85)
- Change noPublishSettings to publish / skip

## 0.11.4

_2025-02-21_

- Upgrade to sbt-scalafmt 2.5.4
- Upgrade to scalafmt 3.9.0
- Update sbt-scalafix to 0.14.2 (#82)
- Update sbt-scoverage to 2.3.1 (#83)
- Update sbt-blowout-yaml-circe to 0.2.1 (#80)
- Update sbt-blowout-yaml-circe to 0.2.0 (#79)
- More modular CI steps

## 0.11.3

_2025-01-17_

- Upgrade to scalafmt 3.8.5
- Upgrade to sbt-scalafmt 2.5.4

## 0.11.2

_2025-01-15_

- Upgrade to sbt-scalafix 0.14.0
- Upgrade to sbt-scoverage 2.3.0
- Upgrade to sbt-scalafmt 2.5.3
- Upgrade to scalafmt 3.8.4
- Update sbt, scripted-plugin to 1.10.7 (#77)
- Update sbt-blowout-yaml-circe to 0.1.2 (#76)
- Add `sbt/setup-sbt@v1` action to CI

## 0.11.1

_2024-12-21_

- Use Map instead of Seq for scalafmt and scalafix configuration
- Set OrganizeImports.targetDialect to Auto

## 0.11.0

_2024-12-21_

- Split plugin into root, scalafix, scalafmt and tpolecat plugins
- Update sbt-ci-release to 1.9.2 (#75)

## 0.10.4

_2024-12-09_

- Ensure scalafix config generation on scalafixCheck

## 0.10.3

_2024-12-09_

- More control over scalafmt scopes
- Remove githubProject setting

## 0.10.2

_2024-12-09_

- Fix .scalafix.conf generation

## 0.10.1

_2024-12-09_

- Fix .scalafmt.conf generation

## 0.10.0

_2024-12-08_

- More scopes to edit scalafmt & scalafix configs
- Use Seq instead of List for better sbt interop
- Extract scalafix rules into separare sbt setting
- Upgrade to sbt 1.10.6
- Update sbt, scripted-plugin to 1.10.4 (#72)
- Update sbt-ci-release to 1.9.0 (#71)
- Update sbt-scoverage to 2.2.2 (#70)
- Update sbt, scripted-plugin to 1.10.3 (#69)
- Update sbt-ci-release to 1.8.0 (#68)
- Update sbt-ci-release to 1.7.0 (#67)
- Fetch entire git history to resolve proper version information

## 0.9.0

_2024-10-02_

- Remove mode parameter in favor of sbt-tpolecat env
- Update sbt-scalafix to 0.13.0 (#65)

## 0.8.1

_2024-09-27_

- Fix scalafix initialization issues
- Upgrade to scala 2.12.20
- Upgrade to sbt-tpolecat 0.5.2
- Upgrade CI dependencies

## 0.8.0

_2024-09-27_

- Add scalafix integration
- Upgrade to scalafmt 3.8.3

## 0.7.7

_2024-07-03_

- Upgrade to sbt-scoverage 2.1.0
- Upgrade to scalafmt 3.8.2
- Upgrade to sbt 1.10.0
- Upgrade to scalafmt 3.8.1
- Update sbt-tpolecat to 0.5.1 (#50)

## 0.7.6

_2024-03-05_

- Upgrade to scalafmt 3.8.0
- Update scala-library to 2.12.19 (#47)
- Update sbt-scoverage to 2.0.11 (#46)
- Update sbt to 1.9.9 (#45)
- Update scalafmt-core to 3.8.0 (#44)

## 0.7.5

_2024-02-14_

- Upgrade to scalafmt 3.7.17
- Upgrade to sbt-scoverage 2.0.10
- Update sbt to 1.9.8 (#43)

## 0.7.4

_2023-09-08_

- Upgrade to scalafmt 3.7.14

## 0.7.3

_2023-09-08_

- Upgrade to sbt-scalafmt 2.5.2
- Upgrade to sbt-sccoverage 2.0.9
- Update sbt to 1.9.4 (#34)

## 0.7.2

_2023-07-27_

- Upgrade to sbt-tpolecat 0.5.0
- Update sbt to 1.9.3 (#31)

## 0.7.1

_2023-07-07_

- Upgrade to scalafmt 3.7.7
- Update sbt-tpolecat to 0.4.3 (#24)
- Update scalafmt-core to 3.7.5 (#22)
- Update sbt to 1.9.1 (#21)
- Update sbt-scoverage to 2.0.8 (#19)
- Remove unused Dockerfile

## 0.7.0

_2023-06-03_

- Remove integration test configurations
- Upgrade to scala 2.12.18
- Upgrade to scalafmt 2.7.4
- Update sbt to 1.9.0 (#18)
- Upgrade to sbt 1.9.0-RC3
- Update sbt-ci-release to 1.5.12 (#16)

## 0.6.2

_2023-02-25_

- Drop support for Scala 2.x
- Update sbt to 1.8.2 (#10)
- Update sbt-scalafmt to 2.5.0 (#9)
- Update sbt-scoverage to 2.0.7 (#14)
- Update sbt-tpolecat to 0.4.2 (#11)
- Upgrade to scalafmt 3.7.2

## 0.6.1

_2022-11-06_

- Upgrade to scalafmt 3.6.1
- Upgrade to sbt 1.7.3

## 0.6.0

_2022-10-21_

- Use a `Map` for `scalafmtRules`
- Upgrade to scalafmt 3.6.0
- Upgrade to sbt-scoverage 2.0.6
- Update sbt to 1.7.2 (#4)
- Upgrade to actions/checkout@v3.1.0
- Upgrade to actions/setup-java@v3.5.1

## 0.5.2

_2022-10-11_

- Upgrade to sbt-scoverage 2.0.5
- Upgrade to scala 2.12.17

## 0.5.1

_2022-09-20_

- Upgrade sbt-scoverage to 2.0.4

## 0.5.0

_2022-09-12_

- Remove release helpers in favor of sbt-ci-release
- Upgrade to scalafmt 3.5.9
- Upgrade to sbt-scoverage to 2.0.2
- Upgrade to scala 2.12.16

## 0.4.2

_2022-09-12_

- Migrate to GitHub Actions

## 0.4.1

_2022-08-05_

- Finding the right scope for `tpolecatDefaultOptionsMode`

## 0.4.0

_2022-08-04_

- Move tpolecatDefaultOptionsMode to project settings
- Upgrade to sbt-scoverage 2.0.1

## 0.3.26

_2022-07-23_

- Remove mode in favor of new sbt-tpolecat modes
- Upgrade to sbt-tpolecat 0.4.1

## 0.3.25

_2022-07-21_

- Upgrade to sbt-tpolecat 0.4.0

## 0.3.24

_2022-07-12_

- Upgrade to sbt 1.7.1
- Upgrade to sbt-scalafmt 3.5.8
- Upgrade to sbt-scoverage 2.0.0
- Upgrade to sbt-sonatype 3.9.13
- Upgrade to sbt-tpolecat 0.3.3

## 0.3.23

_2022-05-23_

- Upgrade scalafmt to 3.5.4
- Upgrade to sbt-tpolecat 0.3.1

## 0.3.22

_2022-04-17_

- Upgrade to sbt-tpolecat 0.2.3

## 0.3.21

_2022-04-08_

- Upgrade to scalafmt 3.5.1
- Upgrade to sbt-tpolecat 0.2.2

## 0.3.20

_2022-02-23_

- Upgrade to scalafmt 3.4.3
- Upgrade to sbt-tpolecat 0.1.22
- Upgrade to sbt 1.6.2

## 0.3.19

_2022-01-11_

- Upgrade to sbt-scoverage 1.9.3

## 0.3.18

_2022-01-03_

- Upgrade to scalafmt 3.3.1
- Upgrade to sbt-scalafmt 2.4.6
- Upgrade to sbt 1.6.1

## 0.3.17

_2021-12-24_

- Upgrade to sbt 1.5.8
- Upgrade to scalafmt 3.2.2
- Upgrade to sbt-scalafmt 2.4.5

## 0.3.16

_2021-11-24_

- Upgrade to scalafmt 3.1.2
- Upgrade to sbt-scalafmt 2.4.4

## 0.3.15

_2021-11-04_

- Upgrade to scalafmt 3.0.8
- Upgrade to sbt-scoverage 1.9.2

## 0.3.14

_2021-09-17_

- Upgrade to sbt-scoverage 1.9.0
- Upgrade to scala 2.12.15
- Upgrade to kind-projector 0.13.2

## 0.3.13

_2021-09-13_

- Upgrade to scalafmt 3.0.3
- Upgrade to sbt-sonatype 3.9.10
- Upgrade to sbt-pgp 2.1.2
- Upgrade to sbt-sonatype 3.9.9

## 0.3.12

_2021-07-23_

- Upgrade to scalafmt 3.0.0-RC6
- Upgrade to sbt-scalafmt 2.4.3
- Upgrade to sbt 1.5.5
- Upgrade to sbt-release 1.1.0

## 0.3.11

- Upgrade to scala 2.12.14
- Upgrade to sbt-scoverage 1.8.2
- Upgrade to sbt-tpolecat 0.1.20
- Upgrade to sbt 1.5.3

## 0.3.10

_2021-05-19_

- Upgrade to sbt-scoverage 1.8.1

## 0.3.11

_2021-06-02_

- Upgrade to scala 2.12.14
- Upgrade to sbt-scoverage 1.8.2
- Upgrade to sbt-tpolecat 0.1.20
- Upgrade to sbt 1.5.3

## 0.3.10

_2021-05-19_

- Upgrade to sbt-scoverage 1.8.1

## 0.3.9

_2021-05-16_

- Upgrade to kind-projector 0.13.0

## 0.3.8

_2021-05-14_

- Upgrade to kind-projector 0.12.0
- Upgrade to sbt-scoverage 1.8.0
- Upgrade to sbt 1.5.2

## 0.3.7

_2021-04-29_

- Upgrade to sbt-scoverage 1.7.0
- Upgrade to sbt-sonatype 3.9.7
- Upgrade to sbt-tpolecat 0.1.17
- Upgrade to sbt 1.5.1

## 0.3.6

_2021-03-05_

- Upgrade to sbt 1.5.0-M2
- Upgrade to sbt-release 1.0.15

## 0.3.5

_2021-03-05_

- Upgrade to simulacrum 1.0.1
- Change sbt-pgp organization to com.github.sbt

## 0.3.4

_2021-02-16_

- Only load simulacrum on scala 2

## 0.3.3

_2021-02-16_

- Only load plugins on scala 2
- Upgrade to kind-projector 0.11.3
- Upgrade to sbt 1.4.7
- Upgrade to scala 2.12.13
- Remove sbt-microsites

## 0.3.2

_2020-12-20_

- Upgrade to scalafmt 2.7.5
- Upgrade to sbt-tpolecat 0.1.16
- Upgrade to sbt-gpg 2.1.1
- Upgrade to kind-projector 0.11.2
- Upgrade to sbt 1.4.5
- Switch to gitlab ci caching

## 0.3.1

_2020-11-20_

- Upgrade to kind-projector 0.11.1
- Upgrade to better-monadic-for 0.3.1
- Upgrade to sbt-tpolecat 0.1.15
- Upgrade to sbt-sonatype 3.9.5
- Upgrade to sbt 1.4.2

## 0.3.0

_2020-10-11_

- Remove automated name prefixing
- Upgrade to sbt-tpolecat 0.1.14
- Upgrade to sbt-scalafmt 2.4.2
- Upgrade to sbt 1.4.0

## 0.2.4

_2020-07-23_

- `it` config should depend on `test` config
- Upgrade to scala 2.12.12
- Upgrade to sbt-sonatype 3.9.4

## 0.2.3

_2020-06-28_

- Remove sbt-silencer
- Upgrade to sbt-tpolecat 0.1.13
- Upgrade to sbt-sonatype 3.9.3
- Upgrade to scalafmt 2.4.0
- Upgrade to sbt-microsites 1.2.1

## 0.2.2

_2020-04-09_

- Run cross version tests in release

## 0.2.1

_2020-03-29_

- Add sbt silencer-plugin

## 0.2.0

_2020-03-28_

- Increase scalafmt maxColumns to 120
- Upgrade to sbt-sonatype 3.9.2

## 0.1.11

_2020-03-27_

- Upgrade to scala 2.12.11
- Upgrade to sbt-microsites 1.1.5
- Upgrade to sbt-sonatype 3.9.1
- Upgrade to sbt-scalafmt 2.3.2
- Upgrade to sbt 1.3.8

## 0.1.10

_2020-02-28_

- Upgrade to sbt-microsites 1.1.2
- Upgrade to sbt-tpolecat 0.1.11

## 0.1.9

_2020-01-30_

- Upgrade to sbt-microsites 1.1.0
- Upgrade to sbt-release 1.0.13
- Upgrade to sbt-scalafmt 2.3.1

## 0.1.8

_2019-12-23_

- Upgrade to sbt-pgp 2.0.1
- Add scalacOption `-Ywarn-macros:after`

## 0.1.7

_2019-12-15_

- Upgrade to sbt-microsites 1.0.2
- Enable -Xexperimental on scala 2.11 and 2.12

## 0.1.6

_2019-12-14_

- Add scalafmt SortModifiers rewrite rule

## 0.1.5

_2019-12-13_

- Use sbt-tpolecat for scalacOptions
- Upgrade to sbt-sonatype 3.8.1
- Upgrade to scalafmt 2.3.0
- Upgrade to sbt 1.3.5

## 0.1.4

_2019-11-20_

- Remove `scalafmtGenerateConfig` setting
- Upgrade to `sbt-scoverage` 1.6.1

## 0.1.3

_2019-11-18_

- Switch from sbt `in` syntax to `/` style
- Enable integration tests by default
- Move scalafmt config generation to `buildSettings`
- Upgrade to sbt 1.3.3
- Upgrade to scalafmt 2.2.1

## 0.1.2

_2019-10-20_

- Upgrade to sbt-scalafmt 2.0.7
- Upgrade to sbt-release 1.0.12

## 0.1.1

_2019-10-07_

- Fix kind-projector compiler plugin dependency
- Upgrade to scala 2.12.10

## 0.1.0

_2019-10-07_

- Upgrade to sbt-sonatype 3.8
- Upgrade to sbt-scalafmt 2.0.6
- Upgrade to sbt-microsites 0.9.7
- Upgrade to kind-projector 0.11.0

## 0.0.9

_2019-09-25_

- Provide defaults for `name` and `normalizedName` in `houserulesSettings`
- Preset useful microsite `mdoc` variables
- Upgrade to sbt 1.3.2

## 0.0.8

_2019-09-20_

- Add environment validation during `publishAndRelease`

## 0.0.7

_2019-09-20_

- Enable sonatypeBundleRelease
- Upgrade to sbt-pgp 2.0.0
- Upgrade to sbt-scalafmt 2.0.5

## 0.0.6

_2019-09-20_

No release available, due to a misconfiguration. Use 0.0.7 instead.

## 0.0.5

_2019-09-13_

- Upgrade to sbt-sonatype 3.7
- Upgrade to sbt-scalafmt 2.0.4
- Upgrade to sbt-micorsites 0.9.4
- Upgrade to sbt 1.3.0

## 0.0.4

_2019-08-01_

- Apply sbt-release settings to every project

## 0.0.3

_2019-08-01_

- Add `micrositeSettings` to publish pre-configured sbt-microsites modules

## 0.0.2

_2019-07-31_

- Add `skip in publish := true` to `noPublishSettings` to avoid errors during publishing multi-project builds
- Introduce `publishAndRelease` command to that runs `publishSigned` and afterwards `sonatypeRelease` if it's not a snapshot build
- Fix unused import compiler flag for 2.11 projects

## 0.0.1

_2019-07-31_

- Initial release
