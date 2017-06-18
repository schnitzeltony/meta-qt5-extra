require ${BPN}.inc

inherit cmake_lib

DEPENDS += "${BPN}-native kcoreaddons polkit-qt-1"

EXTRA_OECMAKE += "-DKAUTH_BACKEND_NAME=POLKITQT5-1"

# executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Auth, -s${_IMPORT_PREFIX}/libexec/kauth/kauth-policy-gen, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kauth/kauth-policy-gen"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"
