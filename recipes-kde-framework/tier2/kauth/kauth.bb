require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native kcoreaddons polkit-qt-1"

EXTRA_OECMAKE += "-DKAUTH_BACKEND_NAME=POLKITQT5-1"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Auth, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Auth, -S${includedir}, -S${STAGING_INCDIR}"

# executables
CMAKE_HIDE_ERROR[3] = "KF5Auth, -S${libexecdir}/kauth-policy-gen, -S${STAGING_LIBDIR_NATIVE}/${BPN}/kauth-policy-gen"
