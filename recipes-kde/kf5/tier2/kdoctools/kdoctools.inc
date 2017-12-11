SUMMARY = "Documentation generation from docbook"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-kf5 perlnative

# allarch recipes
DEPENDS += "docbook-xml-dtd4 docbook-xsl-stylesheets liburi-perl-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b3674a19a7c16bee9f020645e0ddbc55"
SRC_URI[sha256sum] = "9ac9b92f549ef00e261033ffa349f239fb22503c0b5aaf9bded0966af21a661b"

# allarch packages do only install into machine sysroot
# for xml4
OECMAKE_EXTRA_ROOT_PATH = "${STAGING_DIR}/${MACHINE}"
# for xsl (we have to hardcode /usr - ${prefix} is aligned by native.bbclase
EXTRA_OECMAKE += " \
    -DOE_ROOT_PATH_PREFIX=${STAGING_DIR}/${MACHINE}/usr \
    -DCMAKE_AR:FILEPATH=${AR} \
    -DINSTALL_INTERNAL_TOOLS=ON \
"

