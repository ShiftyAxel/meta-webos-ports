SUMMARY = "Phone app written from scratch for Open webOS"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

WEBOS_APPLICATION_NAME = "com.palm.app.phone"

inherit webos_public_repo
inherit webos_arch_indep
inherit enyojs_application
inherit cordova_application

PV = "0.1.0+gitr${SRCPV}"
PR = "r0"

SRCREV = "6b959f3749de0ed41f7e01bfc83e67adc8bf6207"
SRC_URI = "git://github.com/webOS-ports/${PN};protocol=git"
S = "${WORKDIR}/git"
