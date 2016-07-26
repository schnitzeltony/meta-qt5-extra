SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv2 & BSD & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=8608b1f74c58ebcb11718f46e8619749 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
    file://COPYING.LIB;md5=cc4eecf2379e7a2a5f3d0441d680f82a \
"

inherit kde-apps

DEPENDS += " \
    libraw \
    libeigen \
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

PV = "3.0"
SRC_URI = " \
    ${KDE_MIRROR}/stable/krita/${PV}/${BPN}-${PV}.tgz \
    file://0001-fix-build-with-GLES2.patch \
"
SRC_URI[md5sum] = "beb7140471d1b6b0ae92d664743c067f"
SRC_URI[sha256sum] = "4cea85623b709d6d32084c98a0fd76b97ad96d11be9808fca9fcaad2839a9c5a"

FILES_${PN} += " \
"

FILES_${PN}-dbg += " \
"
