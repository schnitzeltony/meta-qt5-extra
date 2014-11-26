require ${BPN}.inc

inherit native

DEPENDS += "kcoreaddons-native"

# we cannot use ${libdir}/${bindir} in native environment - see native.bbclass
CMAKE_HIDE_ERROR[1] = "KF5Auth, -s/usr/lib/${BPN}, -S${STAGING_LIBDIR_NATIVE}/${BPN}"
CMAKE_HIDE_ERROR[2] = "KF5Auth, -s/usr/lib, -S${STAGING_LIBDIR_NATIVE}"

