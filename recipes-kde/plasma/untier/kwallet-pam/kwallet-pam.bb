SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libpam \
    libgcrypt \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b44d10bfba4b6d558fb0c61669e8ea7d"
SRC_URI[sha256sum] = "9e4d8acd454105b64593956e428ac4f9231c00edc53a4f6f83580b1dcea280da"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
FILES_${PN}-dbg += "${base_libdir}/security/.debug"
