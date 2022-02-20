SUMMARY = "Unlock KWallet using PAM"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma features_check

DEPENDS += " \
    libpam \
    libgcrypt \
    kwallet \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "7341102ecb8a892f635c6cc0da01176a3b360e67f4978bc9914bf53abf0175c8"
SRC_URI += "file://0001-use-pkgconfig-to-find-libgcrypt.patch"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES:${PN} += " \
    ${base_libdir}/security \
    ${systemd_user_unitdir} \
"

RDEPENDS:${PN} = "socat"
