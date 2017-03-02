SUMMARY = "Settings application for Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

PV = "0.9.0+git${SRCPV}"

SRCREV = "62dbafe134f8da22f336dd560b374693284531b5"
S = "${WORKDIR}/git"

DEPENDS += " \
    liri-wayland \
    qtquickcontrols \
    vibe \
    qtaccountsservice \
    polkit-qt-1 \
    xkeyboard-config \
"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${datadir}/liri/settings \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/Liri/*/.debug \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "LiriSettings, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "LiriSettings, -S${includedir}, -S${STAGING_INCDIR}"

RREPLACES_${PN} = "hawaii-system-preferences"
RPROVIDES_${PN} = "hawaii-system-preferences"
RCONFLICTS_${PN} = "hawaii-system-preferences"
