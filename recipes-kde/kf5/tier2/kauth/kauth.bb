require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native kcoreaddons polkit-qt-1"

EXTRA_OECMAKE += "-DKAUTH_BACKEND_NAME=POLKITQT5-1"

# executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Auth, -s${_IMPORT_PREFIX}/libexec/kauth-policy-gen, -S${STAGING_LIBEXECDIR_NATIVE}/kauth-policy-gen"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"
