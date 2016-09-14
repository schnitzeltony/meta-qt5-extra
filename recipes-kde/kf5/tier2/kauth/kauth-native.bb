require ${BPN}.inc

inherit native

DEPENDS += "kcoreaddons-native"

SRC_URI += "file://0002-build-kauth-policy-gen-only-with-for-polkit-qt-1-bac.patch"
