SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv2 & BSD & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=8608b1f74c58ebcb11718f46e8619749 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
    file://COPYING.LIB;md5=cc4eecf2379e7a2a5f3d0441d680f82a \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    curl \
    poppler \
    boost \
    libraw \
    libeigen \
    exiv2 \
    fftw \
    \
    karchive \
    kconfig \
    kwidgetsaddons \
    kcompletion \
    kcoreaddons \
    kguiaddons \
    ki18n \
    kitemmodels \
    kitemviews \
    kwindowsystem \
    kio \
    kcrash \
"

PV = "3.1.1"
SRC_URI = " \
    ${KDE_MIRROR}/stable/krita/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-fix-build-with-GLES2.patch \
"
SRC_URI[md5sum] = "322831adc0bc5c7d7ed298f152d57fe7"
SRC_URI[sha256sum] = "62ef2c4b9b19563c1e2e6dc0643dd0880e04469dd5798373401d8dd666720e8f"

# krita has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     sed -i 's:-isystem:-I:g' `find ${B} -name *.make`
}

# HACK - but overidable by BSP
LDFLAGSGL = "-lGLESv2"
LDFLAGS += "${LDFLAGSGL}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
"
