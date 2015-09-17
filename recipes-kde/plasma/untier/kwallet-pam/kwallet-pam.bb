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
SRC_URI[md5sum] = "893378e2456881c59bc342ff3a0f5464"
SRC_URI[sha256sum] = "6c2664c04baa52b5e6141b9514ee3367b904e24c52b08f5b7c48d6cb48162b79"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
    file://0002-fix-install-path.patch \
"

FILES_${PN} += "${libdir}/security"
FILES_${PN}-dbg += "${libdir}/security/.debug"
