require ${BPN}.inc

inherit native

DEPENDS += "karchive-native ki18n-native kcoreaddons-native kconfig-native"

SRC_URI += "file://0001-do-build-kpackagetool-only-on-native.patch"
