require ${BPN}.inc

inherit native

DEPENDS += "kcoreaddons-native"

SRC_URI += "file://0001-Force-build-of-kauth-policy-gen-for-native-build.patch"

EXTRA_OECMAKE += "-DKAUTH_BUILD_CODEGENERATOR_ONLY=ON"
