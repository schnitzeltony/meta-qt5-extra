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
SRC_URI[md5sum] = "888836db6c8fb4f1cc381ed56a690204"
SRC_URI[sha256sum] = "14803fbacd84636a6e0d0e8f37bf8ea847b493653d452bbf633148614ba38969"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
    file://0002-fix-install-path.patch \
"

FILES_${PN} += "${libdir}/security"
FILES_${PN}-dbg += "${libdir}/security/.debug"
