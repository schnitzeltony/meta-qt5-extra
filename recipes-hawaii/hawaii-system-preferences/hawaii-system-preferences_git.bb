SUMMARY = "System preferences for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

DEPENDS += " \
    libhawaii \
    polkit-qt-1 \
    kscreen \
"

SRCREV = "17da37ea0e44f8bc2d20a0018d11944bee4e810e"
PV = "0.6.90+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "HawaiiSystemPreferences, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "HawaiiSystemPreferences, -S${includedir}, -S${STAGING_INCDIR}"
