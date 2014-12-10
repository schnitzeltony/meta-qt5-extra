require ${BPN}.inc

inherit native

DEPENDS += "kcoreaddons-native"

SRC_URI += "file://0002-Force-building-kauth-policy-gen-with-for-polkit-qt-1.patch"
